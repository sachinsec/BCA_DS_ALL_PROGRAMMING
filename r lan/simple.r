a <- as.numeric(readline(prompt = "Enter first number: "))
b <- as.numeric(readline(prompt = "Enter second number: "))
if (is.na(a) || is.na(b)) {
  cat("Invalid input — please enter numeric values.\n")
} else {
  cat(a, "+", b, "=", a + b, "\n")
}