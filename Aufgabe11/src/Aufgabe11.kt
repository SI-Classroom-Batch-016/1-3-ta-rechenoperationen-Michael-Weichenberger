fun main() {
    //Geldautomat
    var eingabe: String
    var euro: Double = 0.0
    var kontostandInYen: Double = 500.0
    println("Wieviel Euro zahlst du Ein?")
    eingabe = readln()
// Berechne hier den neuen Kontostand in Yen (1€ = 142,6 Yen)
    euro = eingabe.toDouble()
    var yen = 142.6
    var kontostand_in_yen = kontostandInYen + euro * yen
    println("Der Kontostand in Yen beträgt $kontostand_in_yen.")
}
