package java
package lang

import scala.scalajs.js

object Math {
  private lazy val internalRandom = new java.util.Random()

  final val E  = 2.718281828459045
  final val PI = 3.141592653589793

  @inline def abs(a: scala.Int): scala.Int = if (a < 0) -a else a
  @inline def abs(a: scala.Long): scala.Long = if (a < 0) -a else a
  @inline def abs(a: scala.Float): scala.Float = if (a < 0) -a else a
  @inline def abs(a: scala.Double): scala.Double = if (a < 0) -a else a

  @inline def max(a: scala.Int, b: scala.Int): scala.Int = if (a > b) a else b
  @inline def max(a: scala.Long, b: scala.Long): scala.Long = if (a > b) a else b
  @inline def max(a: scala.Float, b: scala.Float): scala.Float = if (a > b) a else b
  @inline def max(a: scala.Double, b: scala.Double): scala.Double = if (a > b) a else b

  @inline def min(a: scala.Int, b: scala.Int): scala.Int = if (a < b) a else b
  @inline def min(a: scala.Long, b: scala.Long): scala.Long = if (a < b) a else b
  @inline def min(a: scala.Float, b: scala.Float): scala.Float = if (a < b) a else b
  @inline def min(a: scala.Double, b: scala.Double): scala.Double = if (a < b) a else b

  @inline def ceil(a: scala.Double): scala.Double = js.Math.ceil(a)
  @inline def floor(a: scala.Double): scala.Double = js.Math.floor(a)

  @inline def round(a: scala.Float): scala.Int = js.Math.round(a).toInt
  @inline def round(a: scala.Double): scala.Long = js.Math.round(a).toLong

  @inline def sqrt(a: scala.Double): scala.Double = js.Math.sqrt(a)
  @inline def pow(a: scala.Double, b: scala.Double): scala.Double = js.Math.pow(a, b)

  @inline def exp(a: scala.Double): scala.Double = js.Math.exp(a)
  @inline def log(a: scala.Double): scala.Double = js.Math.log(a)
  @inline def log10(a: scala.Double): scala.Double = log(a) / 2.302585092994046
  @inline def log1p(a: scala.Double): scala.Double = log(a + 1)

  @inline def sin(a: scala.Double): scala.Double = js.Math.sin(a)
  @inline def cos(a: scala.Double): scala.Double = js.Math.cos(a)
  @inline def tan(a: scala.Double): scala.Double = js.Math.tan(a)
  @inline def asin(a: scala.Double): scala.Double = js.Math.asin(a)
  @inline def acos(a: scala.Double): scala.Double = js.Math.acos(a)
  @inline def atan(a: scala.Double): scala.Double = js.Math.atan(a)
  @inline def atan2(y: scala.Double, x: scala.Double): scala.Double = js.Math.atan2(y, x)

  def random(): scala.Double = internalRandom.nextDouble()

  @inline def toDegrees(a: scala.Double): scala.Double = a * 180.0 / PI
  @inline def toRadians(a: scala.Double): scala.Double = a / 180.0 * PI

  @inline def signum(a: scala.Double): scala.Double = {
    if (a > 0) 1.0
    else if (a < 0) -1.0
    else a
  }

  @inline def signum(a: scala.Float): scala.Float = {
    if (a > 0) 1.0f
    else if (a < 0) -1.0f
    else a
  }

  def cbrt(a: scala.Double): scala.Double = {
    if (a == 0 || a.isNaN)
      return a

    val sign = if (a < 0.0) -1.0 else 1.0
    val value = sign * a

    //Initial Approximation
    var x = 0.0
    var xi = pow(value, 0.3333333333333333)

    //Halley's Method (http://metamerist.com/cbrt/cbrt.htm)
    while (abs(x - xi) >= 1E-16) {
      x = xi
      val x3 = js.Math.pow(x, 3)
      val x3Plusa = x3 + value
      xi = x * (x3Plusa + value) / (x3Plusa + x3)
    }
    return sign * xi
  }

  def nextUp(a: scala.Double): scala.Double = {
  // js implementation of nextUp https://gist.github.com/Yaffle/4654250
    import scala.Double._
    if (a != a || a == PositiveInfinity)
      a
    else if (a == NegativeInfinity)
      -MaxValue
    else if (a == MaxValue)
      PositiveInfinity
    else if (a == 0)
      MinValue
    else {
      def iter(x: scala.Double, xi: scala.Double, n: scala.Double): scala.Double = {
        if (Math.abs(xi - x) >= 1E-16) {
          val c0 = (xi + x) / 2
          val c =
            if (c0 == NegativeInfinity || c0 == PositiveInfinity)
              x + (xi - x) / 2
            else
              c0
          if (n == c) xi
          else if (a < c) iter(x = x, xi = c, n = c)
          else iter(x = c, xi = xi, n = c)
        }
        else xi
      }
      val d = Math.max(Math.abs(a) * 2E-16, MinValue)
      val ad = a + d
      val xi0 =
        if (ad == PositiveInfinity) MaxValue
        else ad
      iter(x = a, xi = xi0, n = a)
    }
  }

  def nextAfter(a: scala.Double, b: scala.Double): scala.Double = {
    if (b < a)
      -nextUp(-a)
    else if (a < b)
      nextUp(a)
    else if (a != a || b != b)
      scala.Double.NaN
    else
      b
  }

  def ulp(a: scala.Double): scala.Double = {
    if (abs(a) == scala.Double.PositiveInfinity)
      scala.Double.PositiveInfinity
    else if (abs(a) == scala.Double.MaxValue)
      pow(2, 971)
    else
      nextAfter(abs(a), scala.Double.MaxValue) - a
  }

  def hypot(a: scala.Double, b: scala.Double): scala.Double = {
    // http://en.wikipedia.org/wiki/Hypot#Implementation
    if (abs(a) == scala.Double.PositiveInfinity || abs(b) == scala.Double.PositiveInfinity)
      scala.Double.PositiveInfinity
    else if (a.isNaN || b.isNaN)
      scala.Double.NaN
    else if (a == 0 && b == 0)
      0.0
    else {
      //To Avoid Overflow and UnderFlow
      // calculate |x| * sqrt(1 - (y/x)^2) instead of sqrt(x^2 + y^2)
      val x = abs(a)
      val y = abs(b)
      val m = max(x, y)
      val t = min(x, y) / m
      m * sqrt(1 + t * t)
    }
  }

  def expm1(a: scala.Double): scala.Double = {
    // https://github.com/ghewgill/picomath/blob/master/javascript/expm1.js
    if (a == 0 || a.isNaN)
      a
    // Power Series http://en.wikipedia.org/wiki/Power_series
    // for small values of a, exp(a) = 1 + a + (a*a)/2
    else if (abs(a) < 1E-5)
      a + 0.5 * a * a
    else
      exp(a) - 1.0
  }

  def sinh(a: scala.Double): scala.Double = {
    if (a.isNaN || a == 0.0 || abs(a) == scala.Double.PositiveInfinity)
      a
    else
      (exp(a) - exp(-a)) / 2.0
  }

  def cosh(a: scala.Double): scala.Double = {
    if (a.isNaN)
      a
    else if (a == 0.0)
      1.0
    else if (abs(a) == scala.Double.PositiveInfinity)
      scala.Double.PositiveInfinity
    else
      (exp(a) + exp(-a)) / 2.0
  }

  def tanh(a: scala.Double): scala.Double = {
    if (a.isNaN || a == 0.0)
      a
    else if (abs(a) == scala.Double.PositiveInfinity)
      signum(a)
    else {
      // sinh(a) / cosh(a) =
      // 1 - 2 * (exp(-a)/ (exp(-a) + exp (a)))
      val expma = exp(-a)
      if (expma == scala.Double.PositiveInfinity) //Infinity / Infinity
        -1.0
      else {
        val expa = exp(a)
        val ret = expma / (expa + expma)
        1.0 - (2.0 * ret)
      }
    }
  }

  // TODO The methods not available in the JavaScript Math object
}
