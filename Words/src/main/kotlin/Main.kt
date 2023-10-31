fun main(args: Array<String>) {
    try {
        val str = readln()
        val words = str.split(" ").filter { s: String -> s[0] == 'a' && s.length > 3 }
        if (words.isNotEmpty()) {
            for (word in words) {
                print("$word ")
            }
        }
        else print("Слов на 'а' больше 3 символов не найдено.")
    }
    catch (e: RuntimeException) {
        println("Something went wrong during stdin reading:")
        println(e.message)
    }
}