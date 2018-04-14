import javax.servlet._
import skinny.micro._

object Hello extends WebApp {
  get("/say-hello") {
    s"Hello, ${params.getOrElse("message", "Anonymous")}!\n"
  }
}

class Bootstrap extends LifeCycle {
  override def init(ctx: ServletContext) {
    Hello.mount(ctx)
  }
}