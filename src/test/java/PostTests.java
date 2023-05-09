import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostTests {
    @Test
    void shouldShowPostHellowWorld() {

        given()
                .baseUri("https://postman-echo.com")
                .body("Hello World")//отправляемыеданные(заголовкииqueryможновыставлятьаналогично)
//Выполняемыедействия
                .when()
                .post("/post")
//Проверки
                .then()
                .statusCode(200)
                .body("data", equalTo("Hello World"));
    }
}
