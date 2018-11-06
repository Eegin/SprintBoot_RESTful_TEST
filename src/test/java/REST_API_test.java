
import org.junit.Test;
import org.junit.Before;
//import static io.restassured.RestAssured.expect;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class REST_API_test {
    @Test
    public void simpleExample(){
        expect().statusCode(200).body("content", equalTo("Hello, Philippines!!")).when().get("http://localhost:8080/greeting");
        //expect().statusCode(200).body("content", equalTo("Hello, Nigel!")).when().get("http://localhost:8080/greeting?name=Nigel");

        //given().when().get("http://localhost:8080/greeting").then().assertThat().body("value.quote", equalTo("Hello, Philippines!!"));
        //given().when().get("http://localhost:8080/greeting?name=Nigel").then().assertThat().body("value.quote", equalTo("Hello, Nigel!"));
    }

    @Test
    public void postResponse()
    {
        given().param("name", "").post("http://localhost:8080/greeting").then().body("content", equalTo("Hello, Philippines!!"));
    }

    @Test
    public void postResponseWithParam()
    {
        given().param("name", "Nigel").post("http://localhost:8080/greeting").then().body("content", equalTo("Hello, Nigel!"));
    }

//    @Test
//    public void itemsLessThanTen()
//    {
//        when().
//                get("http://localhost:8080/store").
//                then().
//                body("book.findAll { it.price < 10f }.title", hasItems("Sayings of the Century"));
//    }
}
