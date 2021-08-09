object CaesarCipher extends App {
  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  val Encryption= (c: Char, key: Int, a: String) => a((a.indexOf(c.toUpper) + key) % alphabet.size)


  val Decryption = (c: Char, key: Int, a: String) => a((a.indexOf(c.toUpper) - key) % alphabet.size)

  val Cipher = (algo: (Char, Int, String) => Char, s: String, key: Int, a: String) => s.map(algo(_, key, a))

  val s = scala.io.StdIn.readLine("Secret Message: ")
  val k = scala.io.StdIn.readLine("Shift By: ").toInt

  val ct = Cipher(Encryption, s, k, alphabet)
  val dt = Cipher(Decryption, ct, k, alphabet)

  printf("Encrypted one:%s\n", ct)
  printf("Decrypted one:%s", dt)
}

//object CaesarCipher extends App {
//
//
//  def Cipher ={
//    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
//    val K = (scala.io.StdIn.readLine("Shift By: ").toInt + alphabet.size) % alphabet.size
//
//    def Encryption = {
//
//      val input1 = scala.io.StdIn.readLine("Secret Message: ")
//      val output1 = input1.map((c: Char) => {
//
//        val x = alphabet.indexOf(c.toUpper)
//        if (x == -1) {
//          c
//        }
//        else {
//          alphabet((x + K) % alphabet.size)
//        }
//      });
//      println("Message After the Encription", output1)
//    }
//
//
//
//    def Decryption= {
//
//      val input2 = scala.io.StdIn.readLine("Encrypted Message: ")
//      val output2 = input2.map((c: Char) => {
//        val x = alphabet.indexOf(c.toUpper)
//        if (x == -1) {
//          c
//        }
//        else if (x < K) {
//
//          alphabet(((alphabet.size) - (K - x)) % alphabet.size)
//        }
//
//        else {
//          alphabet((x - K) % alphabet.size)
//        }
//
//      });
//      println("Message After the Decryption", output2)
//    }
//
//    Encryption;
//    Decryption;
//
//  }
//  Cipher;
//}

