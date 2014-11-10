package java.lang

import scala.scalajs.js

// This class is not emitted, but we need to define its members correctly
final class Long(value: scala.Long) extends Number with Comparable[Long] {

  def this(s: String) = this(Long.parseLong(s))

  override def byteValue(): scala.Byte = sys.error("stub")
  override def shortValue(): scala.Short = sys.error("stub")
  def intValue(): scala.Int = sys.error("stub")
  def longValue(): scala.Long = sys.error("stub")
  def floatValue(): scala.Float = sys.error("stub")
  def doubleValue(): scala.Double = sys.error("stub")

  override def equals(that: Any): scala.Boolean = sys.error("stub")

  override def compareTo(that: Long): Int = sys.error("stub")

  override def toString(): String = sys.error("stub")

}

object Long {
  import scala.scalajs.runtime.RuntimeLong
  import RuntimeLong.{fromRuntimeLong, toRuntimeLong}

  final val TYPE = classOf[scala.Long]
  final val MIN_VALUE = -9223372036854775808L
  final val MAX_VALUE = 9223372036854775807L
  final val SIZE = 64

  @inline def valueOf(longValue: scala.Long): Long = new Long(longValue)
  @inline def valueOf(s: String): Long = valueOf(parseLong(s))

  @inline def valueOf(s: String, radix: Int): Long =
    valueOf(parseLong(s, radix))

  @inline def parseLong(s: String): scala.Long =
    fromRuntimeLong(RuntimeLong.fromString(s))

  @inline def parseLong(s: String, radix: Int): scala.Long =
    fromRuntimeLong(RuntimeLong.fromString(s, radix))

  @inline def toString(l: scala.Long): String = toRuntimeLong(l).toString

  def bitCount(i: scala.Long): scala.Int = toRuntimeLong(i).bitCount

  def reverseBytes(i: scala.Long): scala.Long = sys.error("unimplemented")
  def rotateLeft(i: scala.Long, distance: scala.Int): scala.Long = sys.error("unimplemented")
  def rotateRight(i: scala.Long, distance: scala.Int): scala.Long = sys.error("unimplemented")

  def signum(i: scala.Long): scala.Long =
    toRuntimeLong(i).signum

  def numberOfLeadingZeros(l: scala.Long): Int =
    toRuntimeLong(l).numberOfLeadingZeros

  def numberOfTrailingZeros(l: scala.Long): Int =
    toRuntimeLong(l).numberOfTrailingZeros

  def toBinaryString(l: scala.Long): String =
    toRuntimeLong(l).toBinaryString
  def toHexString(l: scala.Long): String =
    toRuntimeLong(l).toHexString
  def toOctalString(l: scala.Long): String =
    toRuntimeLong(l).toOctalString
}
