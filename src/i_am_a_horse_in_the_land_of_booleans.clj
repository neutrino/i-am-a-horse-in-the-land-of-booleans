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

(defn fizzbuzz [n]
  ":(")

(defn teen? [age]
  (if (and (< age 20 ) (> age 12)) true false))

(defn not-teen? [age]
  ":(")

(defn generic-doublificate [x]
  ":(")

(defn leap-year? [year]
  ":(")

; '_______'
