package Demo;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class R1 {

	public static void main(String[] args) 
	{
		//Specific base url
		
				RestAssured.baseURI="https://reqres.in/api/users/2";
				
				//get Request Specifiction Object
				
				RequestSpecification httpRequest =RestAssured.given();
				
				//hit the Request
				
				Response resp =httpRequest.get();//200
				
				Response resp1 =httpRequest.put();//200
				
				Response resp2 =httpRequest.post();//200
				
				Response resp3 =httpRequest.patch();//200
				
				Response resp4 =httpRequest.delete();//204
				
				System.out.println(resp.getStatusCode());
				
				System.out.println(resp.getStatusLine());
				
				System.out.println(resp1.getStatusCode());
				
				System.out.println(resp1.getStatusLine());
				
				System.out.println(resp2.getStatusCode());
				
				System.out.println(resp2.getStatusLine());
				
                System.out.println(resp3.getStatusCode());
				
				System.out.println(resp3.getStatusLine());
				
                System.out.println(resp4.getStatusCode());
				
				System.out.println(resp4.getStatusLine());
				
				
				
				
				
			}
		
	}

