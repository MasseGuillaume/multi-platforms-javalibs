package java.nio

object ByteBuffer {
  private final val HashSeed = -547316498 // "java.nio.ByteBuffer".##

  def allocate(capacity: Int): ByteBuffer =
    wrap(new Array[Byte](capacity))

  def allocateDirect(capacity: Int): ByteBuffer =
    allocate(capacity)

  def wrap(array: Array[Byte], offset: Int, length: Int): ByteBuffer =
    HeapByteBuffer.wrap(array, 0, array.length, offset, length, false)

  def wrap(array: Array[Byte]): ByteBuffer =
    wrap(array, 0, array.length)
}

abstract class ByteBuffer private[nio] (
    _capacity: Int, private[nio] val _array: Array[Byte],
    private[nio] val _arrayOffset: Int)
    extends Buffer(_capacity) with Comparable[ByteBuffer] {

  private[nio] type ElementType = Byte
  private[nio] type BufferType = ByteBuffer

  def this(_capacity: Int) = this(_capacity, null, -1)

  private var _order: ByteOrder = ByteOrder.BIG_ENDIAN

  def slice(): ByteBuffer

  def duplicate(): ByteBuffer

  def asReadOnlyBuffer(): ByteBuffer

  def get(): Byte

  def put(b: Byte): ByteBuffer

  def get(index: Int): Byte

  def put(index: Int, b: Byte): ByteBuffer

  @noinline
  def get(dst: Array[Byte], offset: Int, length: Int): ByteBuffer =
    GenBuffer(this).generic_get(dst, offset, length)

  def get(dst: Array[Byte]): ByteBuffer =
    get(dst, 0, dst.length)

  @noinline
  def put(src: ByteBuffer): ByteBuffer =
    GenBuffer(this).generic_put(src)

  @noinline
  def put(src: Array[Byte], offset: Int, length: Int): ByteBuffer =
    GenBuffer(this).generic_put(src, offset, length)

  final def put(src: Array[Byte]): ByteBuffer =
    put(src, 0, src.length)

  @inline final def hasArray(): Boolean =
    GenBuffer(this).generic_hasArray()

  @inline final def array(): Array[Byte] =
    GenBuffer(this).generic_array()

  @inline final def arrayOffset(): Int =
    GenBuffer(this).generic_arrayOffset()

  def compact(): ByteBuffer

  def isDirect(): Boolean

  // toString(): String inherited from Buffer

  @noinline
  override def hashCode(): Int =
    GenBuffer(this).generic_hashCode(ByteBuffer.HashSeed)

  override def equals(that: Any): Boolean = that match {
    case that: ByteBuffer => compareTo(that) == 0
    case _                => false
  }

  @noinline
  def compareTo(that: ByteBuffer): Int =
    GenBuffer(this).generic_compareTo(that)(_.compareTo(_))

  final def order(): ByteOrder = _order

  final def order(bo: ByteOrder): ByteBuffer = {
    if (bo == null)
      throw new NullPointerException
    _order = bo
    this
  }

  /* Not implemented:

  def getChar(): Char
  def putChar(value: Char): ByteBuffer
  def getChar(index: Int): Char
  def putChar(index: Int, value: Char): ByteBuffer
  def asCharBuffer(): CharBuffer

  def getShort(): Short
  def putShort(value: Short): ByteBuffer
  def getShort(index: Int): Short
  def putShort(index: Int, value: Short): ByteBuffer
  def asShortBuffer(): ShortBuffer

  def getInt(): Int
  def putInt(value: Int): ByteBuffer
  def getInt(index: Int): Int
  def putInt(index: Int, value: Int): ByteBuffer
  def asIntBuffer(): IntBuffer

  def getLong(): Long
  def putLong(value: Long): ByteBuffer
  def getLong(index: Int): Long
  def putLong(index: Int, value: Long): ByteBuffer
  def asLongBuffer(): LongBuffer

  def getFloat(): Float
  def putFloat(value: Float): ByteBuffer
  def getFloat(index: Int): Float
  def putFloat(index: Int, value: Float): ByteBuffer
  def asFloatBuffer(): FloatBuffer

  def getDouble(): Double
  def putDouble(value: Double): ByteBuffer
  def getDouble(index: Int): Double
  def putDouble(index: Int, value: Double): ByteBuffer
  def asDoubleBuffer(): DoubleBuffer

  */
}
