import scala.io.StdIn.readInt
import scala.io.StdIn.readLine

object CaesarCipher{
    def main(args:Array[String]):
    Unit={
        println("Enter a text: ")
        var text = readLine()

        println("Enter the shifting number: ")
        var num = readInt()

        val encryptVal = cipher(encrypt, text, num)
        val decryptVal = cipher(decrypt, encryptVal, num)

        println("Text : " + text)
        println("Cipher : " + encryptVal)
        println("Decipher : " + decryptVal)
    }

    def encrypt(text:String, shift:Int):String={
        val simpleShift = shift % 26
        text.map { char =>
        if (char.isLetter) {
            val base = if (char.isUpper) 'A' else 'a'
            ((char - base + simpleShift + 26) % 26 + base).toChar
        } else {
            char
        }
        }
    }

    def decrypt(ciphertext: String, shift: Int): String = {
        encrypt(ciphertext, -shift)
    }

    def cipher(function: (String, Int) => String, data: String, shift: Int): String = {
        function(data, shift)
    }
}