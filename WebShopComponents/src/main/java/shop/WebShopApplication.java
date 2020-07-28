package shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

import shop.customers.service.AddressDTO;
import shop.customers.service.CustomerDTO;
import shop.order.service.OrderDTO;
import shop.products.service.ProductDTO;
import shop.shopping.service.ShoppingCartDTO;

@SpringBootApplication
public class WebShopApplication implements CommandLineRunner {
	@Autowired
	private RestOperations  restTemplate;

	public static void main(String[] args) {
		SpringApplication.run(WebShopApplication.class, args);
	}

	@Bean
	RestTemplate restTemplate() {
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
		restTemplate.getMessageConverters().add(new StringHttpMessageConverter());
		return restTemplate;
	}

	@Override
	public void run(String... args) throws Exception {
		//create customer
		CustomerDTO customerDto = new CustomerDTO("101","Frank","Brown","fBrown@Hotmail.com","123456");
		AddressDTO addressDTO = new AddressDTO("1000 N main Street", "Fairfield","52557","USA");
		customerDto.setAddress(addressDTO);
		//todo: call the customer component to add the customer
				String url="http://localhost:8080/customer";
			    restTemplate.postForEntity(url,customerDto,CustomerDTO.class);
			    
			     

				// get customer
				//todo: call the customer component to get the customer with id 101 and print the result
				String url2="http://localhost:8080/customer/101";
				ResponseEntity<CustomerDTO> customerDTOGet=restTemplate.getForEntity(url2,CustomerDTO.class);
			System.out.println(" The customer is \n" + customerDTOGet.getBody());
				//create products
			

			//todo: call the product component to create the first product 
			//todo: call the product component to create the second product
			String urlAddProduct1="http://localhost:8080/product/1/food/40.00";
			String urlAddProduct2="http://localhost:8080/product/2/TV/800.00";
			restTemplate.postForObject(urlAddProduct1,String.class,ProductDTO.class);
			restTemplate.postForObject(urlAddProduct2,String.class,ProductDTO.class);




			//set stock	
			//todo: call the product component to set the stock for the first product
			String urlAddProduct3="http://localhost:8080/product/stock/1/10/checolate";
			restTemplate.postForObject(urlAddProduct3,String.class,ProductDTO.class);

			//get a product
			//todo: call the product component to get the the first product and print the result
			String urlAddProduct4="http://localhost:8080/product/1";
			ResponseEntity<ProductDTO> productDTOResponseEntity= restTemplate.getForEntity(urlAddProduct4,ProductDTO.class);
			System.out.println("The first product is : " + productDTOResponseEntity.getBody());
		// add products to the shoppingcart
		//todo: call the shopping component to add the first product to the cart
		//todo: call the shopping component to add the second product to the cart

			String urlAddCart1="http://localhost:8080/cart/1/1/22";
			restTemplate.postForObject(urlAddCart1,String.class,ShoppingCartDTO.class);
			

		//get the shoppingcart
		//todo: call the shopping component to get the cart and print the result
			
			String urlgetshopcart="http://localhost:8080/cart/1";
			ResponseEntity<ShoppingCartDTO>shopentity=restTemplate.getForEntity(urlgetshopcart, ShoppingCartDTO.class);
			System.out.println("The first cart is : " + shopentity.getBody());
		//checkout the cart		
		//todo: call the shopping component to checkout the cart 
			String shoppingUrl="http://localhost:8080/cart/checkout/1";
			restTemplate.postForObject(shoppingUrl,String.class,ShoppingCartDTO.class);
		
		//get the order
		//todo: call the order component to get the order and print the result 
		
			String urlOrder="http://localhost:8080/order/1";
			ResponseEntity<OrderDTO> orderDTOResponseEntity=restTemplate.getForEntity(urlOrder,OrderDTO.class);
			System.out.println(" order is  "+orderDTOResponseEntity.getBody());
		//add customer to order
		//todo: call the order component to add a customer to the order
		
			String orderUrll="http://localhost:8080/order/setCustomer/1/101";
				 restTemplate.postForObject(orderUrll,String.class,OrderDTO.class);
				 
				 String orderUrlll="http://localhost:8080/order/1";
					restTemplate.postForObject(orderUrlll,String.class,String.class);
					//get the order
					//todo: call the order component to get the order and print the result

					ResponseEntity<OrderDTO> orderDTOResponseEntity2=restTemplate.getForEntity(urlOrder,OrderDTO.class);
					System.out.println(" order is "+orderDTOResponseEntity2.getBody());
		
	}


}
