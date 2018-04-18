import java.sql.DriverManager

import com.google.cloud.sql.jdbc.Driver
import javax.servlet._
import skinny.micro._

object Hello extends WebApp {
  // v本当はダメですがSQLのパスメモっときます
  // x8pzmgnILG337ylj
  get("/say-hello") {
    s"Hello, ${params.getOrElse("message", "Anonymous")}!\n"

//    val connection = DriverManager.getConnection("jdbc:google:mysql://myinstance/users", "root", "x8pzmgnILG337ylj")
//    val statement = connection.createStatement
//
//
//
//    val sql = "INSERT INTO users (name, password, admin) values ('nns', 'hoge', false);"
//    val result = statement.executeUpdate(sql)
////    System.out.println("結果１：" + result)
//    s"結果：$result\n"


  }
}

class Bootstrap extends LifeCycle {
  override def init(ctx: ServletContext) {
    Hello.mount(ctx)
  }
}