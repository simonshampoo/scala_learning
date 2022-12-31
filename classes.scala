class ChecksumAccumulator { // whatever that means
  var sum = 0
  def add(b: Byte): Unit = { sum += b }
  def checksum(): Int = { ~(sum & 0xFF) + 1 }
}



val acc = new checkSumAccumulator

acc.sum = 14

println(acc.sum)

