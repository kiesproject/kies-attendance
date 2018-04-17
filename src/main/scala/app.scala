import java.sql.DriverManager

import com.google.cloud.sql.jdbc.Driver
import javax.servlet._
import skinny.micro._

object Hello extends WebApp {
  // v本当はダメですがSQLのパスメモっときます
  // x8pzmgnILG337ylj
  get("/say-hello") {
    s"Hello, ${params.getOrElse("message", "Anonymous")}!\n"
  }

  DriverManager.getConnection("", "", "")
}

class Bootstrap extends LifeCycle {
  override def init(ctx: ServletContext) {
    Hello.mount(ctx)
  }
}