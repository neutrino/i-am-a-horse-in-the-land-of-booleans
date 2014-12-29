(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x](if (or (= x nil) (= x false)) false true))

; Exercise 3
; Write the function (abs n), which returns the absolute value of n,
; i.e. if n<0, the value of (abs n) is −n, and otherwise n.
(defn abs [x] (if (< x 0 ) (- x) x ))


; Exercise 4
; Write the function (divides? divisor n), which returns true if
; divisor divides n and false otherwise.
; (mod num div) returns 0 if div divides num exactly:
; (mod 10 5) ;=> 0
; (mod 3 2)  ;=> 1
(defn divides? [divisor n](if (= 0 (mod n divisor)) true false ))


; Exercise 5
; Write the function (fizzbuzz n) that returns
; "fizz" when n is divisible by 3,
; "buzz" when n is divisible by 5,
; "gotcha!" when n is divisible by 15, and
; the empty string "" otherwise.
; Use the divides? function from the previous exercise.
; (fizzbuzz 2)  ;=> ""
; (fizzbuzz 45) ;=> "gotcha!"
; (fizzbuzz 48) ;=> "fizz"
; (fizzbuzz 70) ;=> "buzz"
(defn fizzbuzz [n]
  (cond
    (and (divides? 5 n ) (divides? 3 n)) "gotcha!"
    (divides? 5 n) "buzz"
    (divides? 3 n) "fizz"
    :else ""
  )
)


(defn teen? [age]
  (if (and (< age 20 ) (> age 12)) true false))

; Exercise 7
; Write the function (not-teen? age), which returns true when teen? returns false and false otherwise.
; (not-teen? 13) ;=> false
; (not-teen? 25) ;=> true
; (not-teen? 12) ;=> true
; (not-teen? 19) ;=> false
; (not-teen? 20) ;=> true

(defn not-teen? [age](not (teen? age)))


; Exercise 6
; Write a function (generic-doublificate x) that takes one argument and
;   - doubles it if it is a number,
;   - returns nil if it is an empty collection,
;   - if it is a list or a vector, returns two times the length of it
;   - returns true otherwise.
;
; You can use the following functions:
; (number? n) returns true if n is a number.
; (empty? coll) returns true if coll is empty.
; (list? coll) and (vector? coll) test if coll is a list or a vector.
; (count coll) returns the length of a list or a vector.
;
; (generic-doublificate 1)        ;=> 2
; (generic-doublificate [1 2])    ;=> 4
; (generic-doublificate '(65 21)) ;=> 4
; (generic-doublificate {})       ;=> nil
; (generic-doublificate [])       ;=> nil
; (generic-doublificate {:a 1})   ;=> true

(defn generic-doublificate [x]
  (cond
    (number? x) (* 2 x)
    (empty? x) nil
    (or (list? x) (vector? x)) (* 2 (count x))
    :else true)
  )

(defn leap-year? [year]
  ":(")

; '_______'
