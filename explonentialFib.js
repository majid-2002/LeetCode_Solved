function fib(n) {
  if (n == 0) return 0;

  if (n == 1) return 1;

  return fib(n - 1) + fib(n - 2);
}

console.log(fib(3));

// O(2^n)
// exponent growth in the levels for eg: fib(4) = 2^4-1 = 2^3;

// fib(3)
//    |
//    |--> fib(2) + fib(1)
//    |       |       |
//    |       |       +--> 1
//    |       |
//    |       +--> fib(0)
//    |               |
//    |               +--> 0
//    |
//    +--> fib(1)
//            |
//            +--> 1
