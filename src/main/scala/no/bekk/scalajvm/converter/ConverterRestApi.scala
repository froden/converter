package no.bekk.scalajvm.converter

import org.scalatra.ScalatraFilter
import ConverterRestApi._

class ConverterRestApi extends ScalatraFilter {

  get(rootRoute) {
    <html>
      <body>
        <h1>Converter</h1>
        <p>
          This is a simple conversion service
        </p>
        <ul>
          <li><a href={celsiusToFahrenheitRoute}>Celsius to Fahrenheit</a></li>
        </ul>
      </body>
    </html>
  }

  get(celsiusToFahrenheitRoute) {
    <html>
      <body>
        <h1>Celsius to Fahrenheit</h1>
        <table border="1">
          <tr><th>Celsius</th><th>Fahrenheit</th></tr>
          <!-- Tabell med eksempelkonverteringer og link til selve konverteringen alene (og motsatt vei) -->
        </table>
        {footer}
      </body>
    </html>
  }

  get(fahrenheitToCelsiusRoute) {
    redirect(celsiusToFahrenheitRoute)
  }

  // 2.1
  //route for konvertering av enkeltverdi GET /celsius/fahrenheit/32
  //skal kun returnere resultat i body
  //hint gjenbruk routevariablene nedenfor

  // 2.2
  //route for konvertering av enkeltverdi fra fahrenheit til celsius (GET /fahrenheit/celsius)
  //skal kun returnere resultat i body
  //hint gjenbruk routevariablene nedenfor

  val footer = {
    <p>
      <ul>
        <li><a href={rootRoute}>Converter</a></li>
        <li><a href={celsiusToFahrenheitRoute}>Celsius to Fahrenheit</a></li>
      </ul>
    </p>
  }
}

object ConverterRestApi {
  val rootRoute = "/"
  val celsiusToFahrenheitRoute = "/celsius/fahrenheit"
  val fahrenheitToCelsiusRoute = "/fahrenheit/celsius"
}