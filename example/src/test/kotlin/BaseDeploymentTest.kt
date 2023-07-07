import com.google.common.io.Resources
import com.google.gson.GsonBuilder
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test
import java.nio.charset.Charset

class BaseDeploymentTest {

    @Test
    fun testDeployment() {
        val gson = GsonBuilder()
            .setPrettyPrinting()
            .setDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX")
            .create()

        val expected = Resources.toString(Resources.getResource("deployment.json"), Charset.defaultCharset())

        gson.toJson(BaseDeployment("foo")).trim() shouldBe expected.trim()
    }
}
