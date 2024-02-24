def call(Map config = [name:dayOfWeek]) {
    bat "echo Hello ${config.name}. Today is ${config.dayOfWeek}."
}
