import java.io.File
import java.util.logging.Logger
import java.util.logging.Logger.getLogger

fun main() {
    File("application.log").writeText("i am started")
}
fun main1() {
    getLogger().debug("i am destroyed")
}
fun getLogger(): Logger = LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME)

class LoggerFactory {
}

fun getLogger(name: String): Logger = LoggerFactory.getLogger(name)