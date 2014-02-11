(ns sudoku.core-test
  (:require [midje.sweet :refer :all]
            [sudoku.core :refer :all]))


(fact "fibonacci numbers up to 10 (inclusive)" 
  (get-fibonacci 10) => [0,1,1,2,3,5,8]
  )
 (fact "fibonacci numbers up to 13 (inclusive)" 
   (get-fibonacci 13) => [0,1,1,2,3,5,8,13]
 )

(fact "get next fibonacci sequence given existing sequence"
  (get-next-fib-number [0 1]) => [0 1 1]
  (get-next-fib-number [0 1 1]) => [0 1 1 2])

(fact "return even numbers"
  (get-even-number [0 1 1 2 3 5 8]) => [0 2 8]
  )

(fact "get sum of numbers "
  (get-sum-of-numbers [0 1 1 2 3 5 8]) => 20)

(fact "Project Euler Problem #2"
  (solve-fibonacci-even-sum 4000000) => 4613732)
