package no.bekk.scalajvm.converter

import org.scalatra.ScalatraFilter

class ConverterFilter extends ScalatraFilter with Converter {

  val rootRoute = "/"
  val celsiusToFahrenheitRoute = "/celsius/fahrenheit"
  val fahrenheitToCelsiusRoute = "/fahrenheit/celsius"

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
    val conversions = (-50 to (100, 10)).reverse.map(in => (in, celsiusToFahrenheit(in)))

    <html>
      <body>
        <h1>Celsius to Fahrenheit</h1>
        <table border="1">
          <tr><th>Celsius</th><th>Fahrenheit</th></tr>
          {for (conversion <- conversions) yield
            <tr>
              <td><a href={celsiusToFahrenheitRoute + "/" + conversion._1}>{conversion._1}</a></td>
              <td><a href={fahrenheitToCelsiusRoute + "/" + conversion._2}>{conversion._2}</a></td>
            </tr>
          }
        </table>
        {footer}
      </body>
    </html>
  }

  get(fahrenheitToCelsiusRoute) {
    redirect(celsiusToFahrenheitRoute)
  }

  get(celsiusToFahrenheitRoute + "/:input") {
    celsiusToFahrenheit(params("input").toDouble)
  }

  get(fahrenheitToCelsiusRoute + "/:input") {
    fahrenheitToCelsius(params("input").toDouble)
  }

  val footer = {
    <p>
      <ul>
        <li><a href={rootRoute}>Converter</a></li>
        <li><a href={celsiusToFahrenheitRoute}>Celsius to Fahrenheit</a></li>
      </ul>
    </p>
  }
}