val xs: List[Int] = for (n <- (0 to 10).toList) yield (2*n)

val namesWithUnderscores = List("_adam", "_david", "_frank")

val namesWithoutUnderscores = for (name <- namesWithUnderscores) yield  name.drop(1)

val namesWithoutUnderscoresCapitalized = for (name <- namesWithoutUnderscores) yield name.capitalize

val allInOne = for (name <- namesWithUnderscores) yield name.drop(1).capitalize

println(xs)

println(namesWithUnderscores)

println(namesWithoutUnderscores)

println(namesWithoutUnderscoresCapitalized)

println(allInOne)
