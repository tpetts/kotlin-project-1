/*
    Author: Tia Petts
    Assignment: Project01
 */
fun main() {
    // Requirement #1
    // Assigning & Declarations
    println("-----Requirement # 1-----")
    val myName = "Tia"
    val myEmail = "tpetts@madisoncollege.edu"

    // Writing it out
    println("My name is: $myName\nMy email address is: $myEmail")
    // -----------------------------------

    // Requirement #2
    println("\n\n-----Requirement #2-----")
    val firstName = "Tia" // name does not change, which is why val is used
    val lastName = "Petts" // name does not change, which is why val is used
    var age = 28 // age changes per year, which is why var is used
    var GPA = 3.95 // gpa changes based on academic grading scale
    var isHonorStudent = true // changes based on gpa

    println("Name: $firstName $lastName\nAge: $age\nGPA: $GPA\nHonor Student: $isHonorStudent")
    // ---------------------------------------

    // Requirement #3
    println("\n\n-----Requirement #3-----")
    val myCourses: Array<String> = arrayOf(
        "152-159 Kotlin Programming",
        "152-121 Advanced CSS",
        "152-110 UI/UX for Developers",
        "60895 Math Of Finance"
    )
    var item = 0
    while (item < myCourses.size) {
        println(myCourses[item])
        item++
    }

    // Requirement #4
    println("\n\n-----Requirement #4-----")
    item = 0
    while (item < myCourses.size) {
        println("Index $item has course ${myCourses[item]}")
        item++
    }
    // I know this seems redundant, but wanted to showcase that I have met all the requirements;

    // Requirement #5
    println("\n\n-----Requirement #5-----")
    for (x: Int in 100 downTo 1 step 4) {
        if (x != 44) {
            print("$x ")
        }
    }

    // Requirement #6
    println("\n\n-----Requirement #6-----")
    processUserInfo()
}

// Requirement #6, continued
fun processUserInfo() {
    // Prompting the user for their name and storing it into the userName variable
    print("What's your name? ")
    val userName: String? = readLine()?.capitalize()

    // Prompting the user for their address and storing it into the userAddress variable
    print("What's your address? ")
    val userAddress: String? = readLine()

    // setting a key
    var userNumberInValid = true
    var convertNumber: Int? = null

    do {
        // Prompting the user to pick a number between 5-10 and storing it into the userNumber variable
        print("Pick a number between 5 and 10: ")
        val userNumber: String? = readLine()
        val convertNumberTemp: Int? = userNumber?.toIntOrNull()

        // Validating the userNumber input value
        if (convertNumberTemp == null) {
            println("Error, the value entered must be numeric; Please try again.")
        } else if ((convertNumberTemp >= 5) && (convertNumberTemp <= 10)) {
            convertNumber = convertNumberTemp
            userNumberInValid = false
        } else println("Error, the value entered must be between 5 and 10; Please try again.")
    } while (userNumberInValid) // making the key the opposite of what it was

    var userPet: String?
    var userPetInvalid = true // userPetInvalid is Invalid until proven to be valid; loop is controlled by this state
    do { // ask at least once, evaluate
        println("Do you have a pet?")  // Asking the user if they have a pet
        userPet =
            readLine()?.toLowerCase() // storing user entry into the userPet variable, making is lowercase for convenience in evaluation
        if (userPet == "y" || userPet == "n") { // checking to see if userPet is 'y' or 'n'

            userPetInvalid =
                false // if userPet is 'y' or 'n', stop looping because the entry is correct; Invalid is proven to be true
        } else { // otherwise
            println("Error, please enter 'Y' for 'YES' or 'N' for 'No':") // flag an error message to the user, and have them re-enter
        }

    } while (userPetInvalid) // Do all of the above, while userPetInvalid is Invalid

    val userPetAnswer =
        if (userPet == "y") {
            "Yes"
        } else {
            "No"
        }
    println("\n\nYou entered the following information:\nName: $userName\nAddress: $userAddress\nNumber selected: $convertNumber\nHas a pet? $userPetAnswer")


}