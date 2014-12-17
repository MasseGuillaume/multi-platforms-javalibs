package java.lang

import scala.scalajs.js

class Character(private val value: scala.Char) extends Comparable[Character] {

  def charValue(): scala.Char = value

  override def equals(that: Any) =
    that.isInstanceOf[Character] && (value == that.asInstanceOf[Character].charValue)

  override def compareTo(that: Character): Int =
    Character.compare(charValue, that.charValue)

  override def toString(): String =
    Character.toString(value)

  override def hashCode(): Int = value.##

  /*
   * Methods on scala.Char
   * The following methods are only here to properly support reflective calls
   * on boxed primitive values. YOU WILL NOT BE ABLE TO USE THESE METHODS, since
   * we use the true javalib to lookup symbols, this file contains only
   * implementations.
   */
  protected def toByte: scala.Byte     = value.toByte
  protected def toShort: scala.Short   = value.toShort
  protected def toChar: scala.Char     = value.toChar
  protected def toInt: scala.Int       = value
  protected def toLong: scala.Long     = value.toLong
  protected def toFloat: scala.Float   = value.toFloat
  protected def toDouble: scala.Double = value.toDouble

  protected def unary_~ : scala.Int = ~value
  protected def unary_+ : scala.Int = value
  protected def unary_- : scala.Int = -value

  protected def +(x: String): String = value + x

  protected def <<(x: scala.Int): scala.Int = value << x
  protected def <<(x: scala.Long): scala.Int = value << x
  protected def >>>(x: scala.Int): scala.Int = value >>> x
  protected def >>>(x: scala.Long): scala.Int = value >>> x
  protected def >>(x: scala.Int): scala.Int = value >> x
  protected def >>(x: scala.Long): scala.Int = value >> x

  protected def ==(x: scala.Byte): scala.Boolean = value == x
  protected def ==(x: scala.Short): scala.Boolean = value == x
  protected def ==(x: scala.Char): scala.Boolean = value == x
  protected def ==(x: scala.Int): scala.Boolean = value == x
  protected def ==(x: scala.Long): scala.Boolean = value == x
  protected def ==(x: scala.Float): scala.Boolean = value == x
  protected def ==(x: scala.Double): scala.Boolean = value == x

  protected def !=(x: scala.Byte): scala.Boolean = value != x
  protected def !=(x: scala.Short): scala.Boolean = value != x
  protected def !=(x: scala.Char): scala.Boolean = value != x
  protected def !=(x: scala.Int): scala.Boolean = value != x
  protected def !=(x: scala.Long): scala.Boolean = value != x
  protected def !=(x: scala.Float): scala.Boolean = value != x
  protected def !=(x: scala.Double): scala.Boolean = value != x

  protected def <(x: scala.Byte): scala.Boolean = value < x
  protected def <(x: scala.Short): scala.Boolean = value < x
  protected def <(x: scala.Char): scala.Boolean = value < x
  protected def <(x: scala.Int): scala.Boolean = value < x
  protected def <(x: scala.Long): scala.Boolean = value < x
  protected def <(x: scala.Float): scala.Boolean = value < x
  protected def <(x: scala.Double): scala.Boolean = value < x

  protected def <=(x: scala.Byte): scala.Boolean = value <= x
  protected def <=(x: scala.Short): scala.Boolean = value <= x
  protected def <=(x: scala.Char): scala.Boolean = value <= x
  protected def <=(x: scala.Int): scala.Boolean = value <= x
  protected def <=(x: scala.Long): scala.Boolean = value <= x
  protected def <=(x: scala.Float): scala.Boolean = value <= x
  protected def <=(x: scala.Double): scala.Boolean = value <= x

  protected def >(x: scala.Byte): scala.Boolean = value > x
  protected def >(x: scala.Short): scala.Boolean = value > x
  protected def >(x: scala.Char): scala.Boolean = value > x
  protected def >(x: scala.Int): scala.Boolean = value > x
  protected def >(x: scala.Long): scala.Boolean = value > x
  protected def >(x: scala.Float): scala.Boolean = value > x
  protected def >(x: scala.Double): scala.Boolean = value > x

  protected def >=(x: scala.Byte): scala.Boolean = value >= x
  protected def >=(x: scala.Short): scala.Boolean = value >= x
  protected def >=(x: scala.Char): scala.Boolean = value >= x
  protected def >=(x: scala.Int): scala.Boolean = value >= x
  protected def >=(x: scala.Long): scala.Boolean = value >= x
  protected def >=(x: scala.Float): scala.Boolean = value >= x
  protected def >=(x: scala.Double): scala.Boolean = value >= x

  protected def |(x: scala.Byte): scala.Int = value | x
  protected def |(x: scala.Short): scala.Int = value | x
  protected def |(x: scala.Char): scala.Int = value | x
  protected def |(x: scala.Int): scala.Int = value | x
  protected def |(x: scala.Long): scala.Long = value | x

  protected def &(x: scala.Byte): scala.Int = value & x
  protected def &(x: scala.Short): scala.Int = value & x
  protected def &(x: scala.Char): scala.Int = value & x
  protected def &(x: scala.Int): scala.Int = value & x
  protected def &(x: scala.Long): scala.Long = value & x

  protected def ^(x: scala.Byte): scala.Int = value ^ x
  protected def ^(x: scala.Short): scala.Int = value ^ x
  protected def ^(x: scala.Char): scala.Int = value ^ x
  protected def ^(x: scala.Int): scala.Int = value ^ x
  protected def ^(x: scala.Long): scala.Long = value ^ x

  protected def +(x: scala.Byte): scala.Int = value + x
  protected def +(x: scala.Short): scala.Int = value + x
  protected def +(x: scala.Char): scala.Int = value + x
  protected def +(x: scala.Int): scala.Int = value + x
  protected def +(x: scala.Long): scala.Long = value + x
  protected def +(x: scala.Float): scala.Float = value + x
  protected def +(x: scala.Double): scala.Double = value + x

  protected def -(x: scala.Byte): scala.Int = value - x
  protected def -(x: scala.Short): scala.Int = value - x
  protected def -(x: scala.Char): scala.Int = value - x
  protected def -(x: scala.Int): scala.Int = value - x
  protected def -(x: scala.Long): scala.Long = value - x
  protected def -(x: scala.Float): scala.Float = value - x
  protected def -(x: scala.Double): scala.Double = value - x

  protected def *(x: scala.Byte): scala.Int = value * x
  protected def *(x: scala.Short): scala.Int = value * x
  protected def *(x: scala.Char): scala.Int = value * x
  protected def *(x: scala.Int): scala.Int = value * x
  protected def *(x: scala.Long): scala.Long = value * x
  protected def *(x: scala.Float): scala.Float = value * x
  protected def *(x: scala.Double): scala.Double = value * x

  protected def /(x: scala.Byte): scala.Int = value / x
  protected def /(x: scala.Short): scala.Int = value / x
  protected def /(x: scala.Char): scala.Int = value / x
  protected def /(x: scala.Int): scala.Int = value / x
  protected def /(x: scala.Long): scala.Long = value / x
  protected def /(x: scala.Float): scala.Float = value / x
  protected def /(x: scala.Double): scala.Double = value / x

  protected def %(x: scala.Byte): scala.Int = value % x
  protected def %(x: scala.Short): scala.Int = value % x
  protected def %(x: scala.Char): scala.Int = value % x
  protected def %(x: scala.Int): scala.Int = value % x
  protected def %(x: scala.Long): scala.Long = value % x
  protected def %(x: scala.Float): scala.Float = value % x
  protected def %(x: scala.Double): scala.Double = value % x

}

object Character {
  final val TYPE = classOf[scala.Char]
  final val MIN_VALUE = '\u0000'
  final val MAX_VALUE = '\uffff'
  final val SIZE = 16

  def valueOf(charValue: scala.Char) = new Character(charValue)

  /* These are supposed to be final vals of type Byte, but that's not possible.
   * So we implement them as def's, which are binary compatible with final vals.
   */
  def UPPERCASE_LETTER: scala.Byte = 1
  def LOWERCASE_LETTER: scala.Byte = 2
  def TITLECASE_LETTER: scala.Byte = 3
  def MODIFIER_LETTER: scala.Byte = 4
  def OTHER_LETTER: scala.Byte = 5
  def NON_SPACING_MARK: scala.Byte = 6
  def ENCLOSING_MARK: scala.Byte = 7
  def COMBINING_SPACING_MARK: scala.Byte = 8
  def DECIMAL_DIGIT_NUMBER: scala.Byte = 9
  def LETTER_NUMBER: scala.Byte = 10
  def SURROGATE: scala.Byte = 19

  final val MIN_RADIX = 2
  final val MAX_RADIX = 36

  final val MIN_HIGH_SURROGATE = '\uD800'
  final val MAX_HIGH_SURROGATE = '\uDBFF'
  final val MIN_LOW_SURROGATE = '\uDC00'
  final val MAX_LOW_SURROGATE = '\uDFFF'
  final val MIN_SURROGATE = MIN_HIGH_SURROGATE
  final val MAX_SURROGATE = MAX_LOW_SURROGATE

  final val MIN_CODE_POINT = 0
  final val MAX_CODE_POINT = 0x10ffff
  final val MIN_SUPPLEMENTARY_CODE_POINT = 0x10000

  // Not implemented:
  //def getType(ch: scala.Char): scala.Int
  //def getType(codePoint: scala.Int): scala.Int

  def digit(c: scala.Char, radix: scala.Int): scala.Int = {
    if (radix > MAX_RADIX || radix < MIN_RADIX)
      -1
    else if (c >= '0' && c <= '9' && c - '0' < radix)
      c - '0'
    else if (c >= 'A' && c <= 'Z' && c - 'A' < radix - 10)
      c - 'A' + 10
    else if (c >= 'a' && c <= 'z' && c - 'a' < radix - 10)
      c - 'a' + 10
    else if (c >= '\uFF21' && c <= '\uFF3A' &&
      c - '\uFF21' < radix - 10)
      c - '\uFF21' + 10
    else if (c >= '\uFF41' && c <= '\uFF5A' &&
      c - '\uFF41' < radix - 10)
      c - '\uFF21' + 10
    else -1
  }

  def isISOControl(c: scala.Char): scala.Boolean = isISOControl(c.toInt)
  def isISOControl(codePoint: scala.Int): scala.Boolean = {
    (0x00 <= codePoint && codePoint <= 0x1F) || (0x7F <= codePoint && codePoint <= 0x9F)
  }

  def isDigit(c: scala.Char): scala.Boolean = c >= '0' && c <= '9'
  //def isLetter(c: scala.Char): scala.Boolean
  //def isLetterOrDigit(c: scala.Char): scala.Boolean
  def isWhitespace(c: scala.Char): scala.Boolean = js.RegExp("^\\s$").test(c.toString)
  //def isSpaceChar(c: scala.Char): scala.Boolean

  // --- UTF-16 surrogate pairs handling ---
  // See http://en.wikipedia.org/wiki/UTF-16

  private final val HighSurrogateMask       = 0xfc00 // 111111 00  00000000
  private final val HighSurrogateID         = 0xd800 // 110110 00  00000000
  private final val LowSurrogateMask        = 0xfc00 // 111111 00  00000000
  private final val LowSurrogateID          = 0xdc00 // 110111 00  00000000
  private final val SurrogateUsefulPartMask = 0x03ff // 000000 11  11111111

  @inline def isHighSurrogate(c: scala.Char): scala.Boolean =
    (c & HighSurrogateMask) == HighSurrogateID
  @inline def isLowSurrogate(c: scala.Char): scala.Boolean =
    (c & LowSurrogateMask) == LowSurrogateID
  @inline def isSurrogatePair(high: scala.Char, low: scala.Char): scala.Boolean =
    isHighSurrogate(high) && isLowSurrogate(low)

  @inline def toCodePoint(high: scala.Char, low: scala.Char): scala.Int =
    ((high & SurrogateUsefulPartMask) << 10) + (low & SurrogateUsefulPartMask) + 0x10000

  // --- End of UTF-16 surrogate pairs handling ---

  def isUnicodeIdentifierStart(c: scala.Char): scala.Boolean =
    reUnicodeIdentStart.test(c.toString)

  def isUnicodeIdentifierPart(c: scala.Char): scala.Boolean =
    isUnicodeIdentifierStart(c) || isIdentifierIgnorable(c) ||
    reUnicodeIdentPartExcl.test(c.toString)

  def isIdentifierIgnorable(c: scala.Char): scala.Boolean =
    reIdentIgnorable.test(c.toString)

  //def isMirrored(c: scala.Char): scala.Boolean
  def isLowerCase(c: scala.Char): scala.Boolean = toLowerCase(c) == c
  def isUpperCase(c: scala.Char): scala.Boolean = toUpperCase(c) == c
  //def isTitleCase(c: scala.Char): scala.Boolean
  //def isJavaIdentifierPart(c: scala.Char): scala.Boolean

  //def getDirectionality(c: scala.Char): scala.Byte

  /* Conversions */
  def toUpperCase(c: scala.Char): scala.Char = c.toString.toUpperCase()(0)
  def toLowerCase(c: scala.Char): scala.Char = c.toString.toLowerCase()(0)
  //def toTitleCase(c: scala.Char): scala.Char
  //def getNumericValue(c: scala.Char): scala.Int

  /* Misc */
  //def reverseBytes(ch: scala.Char): scala.Char

  @inline def toString(c: scala.Char): String =
    js.Dynamic.global.String.fromCharCode(c.toInt).asInstanceOf[String]

  @inline def compare(x: scala.Char, y: scala.Char): scala.Int =
    x - y

  // Based on Unicode 7.0.0
  private[this] lazy val reUnicodeIdentStart =
    new js.RegExp("""[A-Za-z\xAA\xB5\xBA\xC0-\xD6\xD8-\xF6\xF8-\u02C1\u02C6-\u02D1\u02E0-\u02E4\u02EC\u02EE\u0370-\u0374\u0376\u0377\u037A-\u037D\u037F\u0386\u0388-\u038A\u038C\u038E-\u03A1\u03A3-\u03F5\u03F7-\u0481\u048A-\u052F\u0531-\u0556\u0559\u0561-\u0587\u05D0-\u05EA\u05F0-\u05F2\u0620-\u064A\u066E\u066F\u0671-\u06D3\u06D5\u06E5\u06E6\u06EE\u06EF\u06FA-\u06FC\u06FF\u0710\u0712-\u072F\u074D-\u07A5\u07B1\u07CA-\u07EA\u07F4\u07F5\u07FA\u0800-\u0815\u081A\u0824\u0828\u0840-\u0858\u08A0-\u08B2\u0904-\u0939\u093D\u0950\u0958-\u0961\u0971-\u0980\u0985-\u098C\u098F\u0990\u0993-\u09A8\u09AA-\u09B0\u09B2\u09B6-\u09B9\u09BD\u09CE\u09DC\u09DD\u09DF-\u09E1\u09F0\u09F1\u0A05-\u0A0A\u0A0F\u0A10\u0A13-\u0A28\u0A2A-\u0A30\u0A32\u0A33\u0A35\u0A36\u0A38\u0A39\u0A59-\u0A5C\u0A5E\u0A72-\u0A74\u0A85-\u0A8D\u0A8F-\u0A91\u0A93-\u0AA8\u0AAA-\u0AB0\u0AB2\u0AB3\u0AB5-\u0AB9\u0ABD\u0AD0\u0AE0\u0AE1\u0B05-\u0B0C\u0B0F\u0B10\u0B13-\u0B28\u0B2A-\u0B30\u0B32\u0B33\u0B35-\u0B39\u0B3D\u0B5C\u0B5D\u0B5F-\u0B61\u0B71\u0B83\u0B85-\u0B8A\u0B8E-\u0B90\u0B92-\u0B95\u0B99\u0B9A\u0B9C\u0B9E\u0B9F\u0BA3\u0BA4\u0BA8-\u0BAA\u0BAE-\u0BB9\u0BD0\u0C05-\u0C0C\u0C0E-\u0C10\u0C12-\u0C28\u0C2A-\u0C39\u0C3D\u0C58\u0C59\u0C60\u0C61\u0C85-\u0C8C\u0C8E-\u0C90\u0C92-\u0CA8\u0CAA-\u0CB3\u0CB5-\u0CB9\u0CBD\u0CDE\u0CE0\u0CE1\u0CF1\u0CF2\u0D05-\u0D0C\u0D0E-\u0D10\u0D12-\u0D3A\u0D3D\u0D4E\u0D60\u0D61\u0D7A-\u0D7F\u0D85-\u0D96\u0D9A-\u0DB1\u0DB3-\u0DBB\u0DBD\u0DC0-\u0DC6\u0E01-\u0E30\u0E32\u0E33\u0E40-\u0E46\u0E81\u0E82\u0E84\u0E87\u0E88\u0E8A\u0E8D\u0E94-\u0E97\u0E99-\u0E9F\u0EA1-\u0EA3\u0EA5\u0EA7\u0EAA\u0EAB\u0EAD-\u0EB0\u0EB2\u0EB3\u0EBD\u0EC0-\u0EC4\u0EC6\u0EDC-\u0EDF\u0F00\u0F40-\u0F47\u0F49-\u0F6C\u0F88-\u0F8C\u1000-\u102A\u103F\u1050-\u1055\u105A-\u105D\u1061\u1065\u1066\u106E-\u1070\u1075-\u1081\u108E\u10A0-\u10C5\u10C7\u10CD\u10D0-\u10FA\u10FC-\u1248\u124A-\u124D\u1250-\u1256\u1258\u125A-\u125D\u1260-\u1288\u128A-\u128D\u1290-\u12B0\u12B2-\u12B5\u12B8-\u12BE\u12C0\u12C2-\u12C5\u12C8-\u12D6\u12D8-\u1310\u1312-\u1315\u1318-\u135A\u1380-\u138F\u13A0-\u13F4\u1401-\u166C\u166F-\u167F\u1681-\u169A\u16A0-\u16EA\u16EE-\u16F8\u1700-\u170C\u170E-\u1711\u1720-\u1731\u1740-\u1751\u1760-\u176C\u176E-\u1770\u1780-\u17B3\u17D7\u17DC\u1820-\u1877\u1880-\u18A8\u18AA\u18B0-\u18F5\u1900-\u191E\u1950-\u196D\u1970-\u1974\u1980-\u19AB\u19C1-\u19C7\u1A00-\u1A16\u1A20-\u1A54\u1AA7\u1B05-\u1B33\u1B45-\u1B4B\u1B83-\u1BA0\u1BAE\u1BAF\u1BBA-\u1BE5\u1C00-\u1C23\u1C4D-\u1C4F\u1C5A-\u1C7D\u1CE9-\u1CEC\u1CEE-\u1CF1\u1CF5\u1CF6\u1D00-\u1DBF\u1E00-\u1F15\u1F18-\u1F1D\u1F20-\u1F45\u1F48-\u1F4D\u1F50-\u1F57\u1F59\u1F5B\u1F5D\u1F5F-\u1F7D\u1F80-\u1FB4\u1FB6-\u1FBC\u1FBE\u1FC2-\u1FC4\u1FC6-\u1FCC\u1FD0-\u1FD3\u1FD6-\u1FDB\u1FE0-\u1FEC\u1FF2-\u1FF4\u1FF6-\u1FFC\u2071\u207F\u2090-\u209C\u2102\u2107\u210A-\u2113\u2115\u2119-\u211D\u2124\u2126\u2128\u212A-\u212D\u212F-\u2139\u213C-\u213F\u2145-\u2149\u214E\u2160-\u2188\u2C00-\u2C2E\u2C30-\u2C5E\u2C60-\u2CE4\u2CEB-\u2CEE\u2CF2\u2CF3\u2D00-\u2D25\u2D27\u2D2D\u2D30-\u2D67\u2D6F\u2D80-\u2D96\u2DA0-\u2DA6\u2DA8-\u2DAE\u2DB0-\u2DB6\u2DB8-\u2DBE\u2DC0-\u2DC6\u2DC8-\u2DCE\u2DD0-\u2DD6\u2DD8-\u2DDE\u2E2F\u3005-\u3007\u3021-\u3029\u3031-\u3035\u3038-\u303C\u3041-\u3096\u309D-\u309F\u30A1-\u30FA\u30FC-\u30FF\u3105-\u312D\u3131-\u318E\u31A0-\u31BA\u31F0-\u31FF\u3400-\u4DB5\u4E00-\u9FCC\uA000-\uA48C\uA4D0-\uA4FD\uA500-\uA60C\uA610-\uA61F\uA62A\uA62B\uA640-\uA66E\uA67F-\uA69D\uA6A0-\uA6EF\uA717-\uA71F\uA722-\uA788\uA78B-\uA78E\uA790-\uA7AD\uA7B0\uA7B1\uA7F7-\uA801\uA803-\uA805\uA807-\uA80A\uA80C-\uA822\uA840-\uA873\uA882-\uA8B3\uA8F2-\uA8F7\uA8FB\uA90A-\uA925\uA930-\uA946\uA960-\uA97C\uA984-\uA9B2\uA9CF\uA9E0-\uA9E4\uA9E6-\uA9EF\uA9FA-\uA9FE\uAA00-\uAA28\uAA40-\uAA42\uAA44-\uAA4B\uAA60-\uAA76\uAA7A\uAA7E-\uAAAF\uAAB1\uAAB5\uAAB6\uAAB9-\uAABD\uAAC0\uAAC2\uAADB-\uAADD\uAAE0-\uAAEA\uAAF2-\uAAF4\uAB01-\uAB06\uAB09-\uAB0E\uAB11-\uAB16\uAB20-\uAB26\uAB28-\uAB2E\uAB30-\uAB5A\uAB5C-\uAB5F\uAB64\uAB65\uABC0-\uABE2\uAC00-\uD7A3\uD7B0-\uD7C6\uD7CB-\uD7FB\uF900-\uFA6D\uFA70-\uFAD9\uFB00-\uFB06\uFB13-\uFB17\uFB1D\uFB1F-\uFB28\uFB2A-\uFB36\uFB38-\uFB3C\uFB3E\uFB40\uFB41\uFB43\uFB44\uFB46-\uFBB1\uFBD3-\uFD3D\uFD50-\uFD8F\uFD92-\uFDC7\uFDF0-\uFDFB\uFE70-\uFE74\uFE76-\uFEFC\uFF21-\uFF3A\uFF41-\uFF5A\uFF66-\uFFBE\uFFC2-\uFFC7\uFFCA-\uFFCF\uFFD2-\uFFD7\uFFDA-\uFFDC]""")

  private[this] lazy val reUnicodeIdentPartExcl =
    new js.RegExp("""[0-9\x5F\u0300-\u036F\u0483-\u0487\u0591-\u05BD\u05BF\u05C1\u05C2\u05C4\u05C5\u05C7\u0610-\u061A\u064B-\u0669\u0670\u06D6-\u06DC\u06DF-\u06E4\u06E7\u06E8\u06EA-\u06ED\u06F0-\u06F9\u0711\u0730-\u074A\u07A6-\u07B0\u07C0-\u07C9\u07EB-\u07F3\u0816-\u0819\u081B-\u0823\u0825-\u0827\u0829-\u082D\u0859-\u085B\u08E4-\u0903\u093A-\u093C\u093E-\u094F\u0951-\u0957\u0962\u0963\u0966-\u096F\u0981-\u0983\u09BC\u09BE-\u09C4\u09C7\u09C8\u09CB-\u09CD\u09D7\u09E2\u09E3\u09E6-\u09EF\u0A01-\u0A03\u0A3C\u0A3E-\u0A42\u0A47\u0A48\u0A4B-\u0A4D\u0A51\u0A66-\u0A71\u0A75\u0A81-\u0A83\u0ABC\u0ABE-\u0AC5\u0AC7-\u0AC9\u0ACB-\u0ACD\u0AE2\u0AE3\u0AE6-\u0AEF\u0B01-\u0B03\u0B3C\u0B3E-\u0B44\u0B47\u0B48\u0B4B-\u0B4D\u0B56\u0B57\u0B62\u0B63\u0B66-\u0B6F\u0B82\u0BBE-\u0BC2\u0BC6-\u0BC8\u0BCA-\u0BCD\u0BD7\u0BE6-\u0BEF\u0C00-\u0C03\u0C3E-\u0C44\u0C46-\u0C48\u0C4A-\u0C4D\u0C55\u0C56\u0C62\u0C63\u0C66-\u0C6F\u0C81-\u0C83\u0CBC\u0CBE-\u0CC4\u0CC6-\u0CC8\u0CCA-\u0CCD\u0CD5\u0CD6\u0CE2\u0CE3\u0CE6-\u0CEF\u0D01-\u0D03\u0D3E-\u0D44\u0D46-\u0D48\u0D4A-\u0D4D\u0D57\u0D62\u0D63\u0D66-\u0D6F\u0D82\u0D83\u0DCA\u0DCF-\u0DD4\u0DD6\u0DD8-\u0DDF\u0DE6-\u0DEF\u0DF2\u0DF3\u0E31\u0E34-\u0E3A\u0E47-\u0E4E\u0E50-\u0E59\u0EB1\u0EB4-\u0EB9\u0EBB\u0EBC\u0EC8-\u0ECD\u0ED0-\u0ED9\u0F18\u0F19\u0F20-\u0F29\u0F35\u0F37\u0F39\u0F3E\u0F3F\u0F71-\u0F84\u0F86\u0F87\u0F8D-\u0F97\u0F99-\u0FBC\u0FC6\u102B-\u103E\u1040-\u1049\u1056-\u1059\u105E-\u1060\u1062-\u1064\u1067-\u106D\u1071-\u1074\u1082-\u108D\u108F-\u109D\u135D-\u135F\u1712-\u1714\u1732-\u1734\u1752\u1753\u1772\u1773\u17B4-\u17D3\u17DD\u17E0-\u17E9\u180B-\u180D\u1810-\u1819\u18A9\u1920-\u192B\u1930-\u193B\u1946-\u194F\u19B0-\u19C0\u19C8\u19C9\u19D0-\u19D9\u1A17-\u1A1B\u1A55-\u1A5E\u1A60-\u1A7C\u1A7F-\u1A89\u1A90-\u1A99\u1AB0-\u1ABD\u1B00-\u1B04\u1B34-\u1B44\u1B50-\u1B59\u1B6B-\u1B73\u1B80-\u1B82\u1BA1-\u1BAD\u1BB0-\u1BB9\u1BE6-\u1BF3\u1C24-\u1C37\u1C40-\u1C49\u1C50-\u1C59\u1CD0-\u1CD2\u1CD4-\u1CE8\u1CED\u1CF2-\u1CF4\u1CF8\u1CF9\u1DC0-\u1DF5\u1DFC-\u1DFF\u203F\u2040\u2054\u20D0-\u20DC\u20E1\u20E5-\u20F0\u2CEF-\u2CF1\u2D7F\u2DE0-\u2DFF\u302A-\u302F\u3099\u309A\uA620-\uA629\uA66F\uA674-\uA67D\uA69F\uA6F0\uA6F1\uA802\uA806\uA80B\uA823-\uA827\uA880\uA881\uA8B4-\uA8C4\uA8D0-\uA8D9\uA8E0-\uA8F1\uA900-\uA909\uA926-\uA92D\uA947-\uA953\uA980-\uA983\uA9B3-\uA9C0\uA9D0-\uA9D9\uA9E5\uA9F0-\uA9F9\uAA29-\uAA36\uAA43\uAA4C\uAA4D\uAA50-\uAA59\uAA7B-\uAA7D\uAAB0\uAAB2-\uAAB4\uAAB7\uAAB8\uAABE\uAABF\uAAC1\uAAEB-\uAAEF\uAAF5\uAAF6\uABE3-\uABEA\uABEC\uABED\uABF0-\uABF9\uFB1E\uFE00-\uFE0F\uFE20-\uFE2D\uFE33\uFE34\uFE4D-\uFE4F\uFF10-\uFF19\uFF3F]""")

  private[this] lazy val reIdentIgnorable =
    new js.RegExp("""[\0-\x08\x0E-\x1B\x7F-\x9F\xAD\u0600-\u0605\u061C\u06DD\u070F\u180E\u200B-\u200F\u202A-\u202E\u2060-\u2064\u2066-\u206F\uFEFF\uFFF9-\uFFFB]""")

}
