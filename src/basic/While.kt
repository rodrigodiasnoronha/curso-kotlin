package basic

class While {

    fun run() {
        var counter = 0;

        // lembrando que break quebra a execuçao do loop
        //        while (counter < 100) {
        //            println("$counter ");
        //            counter++;
        //        }

        var count = 0;
        do {
            print("$count ");
            count++;
        } while (count < 10)

    }
}