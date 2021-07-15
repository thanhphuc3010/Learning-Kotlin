package me.phucpt.tuesday130721

typealias DoubleConversion = (Double) -> Double

fun convert(x: Double, converter: DoubleConversion): Double {
    val result = converter(x)
    println("$x is converted to $result")
    return result
}

fun getConversionLambda(str: String): DoubleConversion {
    if (str == "CentigradeToFahrenheit") {
        return { it * 1.8 + 32 }
    } else if (str == "KgsToPounds") {
        return { it * 2.204623 }
    } else if (str == "PoundsToUSTons") {
        return { it / 2000.0 }
    } else {
        return { it }
    }
}

fun combine(kgsToPounds: DoubleConversion,
            poundToTons: DoubleConversion): DoubleConversion {
    return { poundToTons(kgsToPounds(it)) }
}

fun main() {

    // Convert 2.5kg to Pounds
    println("Convert 2.5kg to Pounds: ${getConversionLambda("KgsToPounds")(2.5)}")

    // convertFive { c -> c * 1.8 + 32 } <=> convertFive { it * 1.8 + 32 }

    // Define two conversion lambdas
    val kgsToPounds = { x: Double -> x * 2.204623 }
    val poundToTons = { x: Double -> x / 2000.0 }

    // Combine two lambdas to create new one
    val kgsToUSTons = combine(kgsToPounds, poundToTons)

    // Use new lambda to convert kgs to tons

    val value = 17.4;
    println("$value kgs is ${kgsToUSTons(value)} tons")

}