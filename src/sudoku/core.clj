(ns sudoku.core
  (:gen-class)
  (:require [clojure.set :refer :all]))

(defn get-fibonacci [max_value]
  (loop [fib_array [0 1]] 
    (if (< max_value (peek fib_array))
      (pop fib_array )
      (recur (get-next-fib-number fib_array))
      )
    )
  )

(defn get-next-fib-number [fib_array]
  ( let [size (count fib_array)]
    (conj fib_array 
      (+ (nth fib_array (- size 1)) (nth fib_array (- size 2)))
      )
    )
  )

(defn get-even-number [vect]
(filter even? vect)
)

(defn get-sum-of-numbers [vect]
(reduce + 0 vect)
)

(defn solve-fibonacci-even-sum [max_value]
  (-> (get-fibonacci max_value)
      get-even-number
      get-sum-of-numbers)
)