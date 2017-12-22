(ns advent2017clojure.core
  (:require [clojure.string :as str]))

(defn inputstring-to-vector [s] (vec (map read-string (str/split s #""))))

(defn comparevector
  "maps the vector on to another in order to compare"
  ([inputvector] 
           (let [[firstelement & morestuff] inputvector]
           (conj (vec morestuff) firstelement)) 
           ))
(defn translate-true-false
  ([x] (if x 1 0)))
(defn dot-product
  [x y] (apply + (map * x y)))
(defn vector-of-valid-entries
  [x] (vec (map translate-true-false (vec (map = x (comparevector x))))))

(defn day1
  "solving captcha"
  ([inputstring]
  (let [x (inputstring-to-vector inputstring)]
   (dot-product x (vector-of-valid-entries x)))))

(defn p2-compare-vector
  [a]
  (let [total (count a)
        offset (/ total 2)
      modulo (fn [x] (mod  x total))
      evaluation-of-index (fn [z] (nth a z))
      shiftedindex (map modulo (take total (iterate inc offset)))  ]
  (vec (map evaluation-of-index shiftedindex))))

(defn vector-of-valid-entries-with-offset
  [x] (vec (map translate-true-false (vec (map = x (p2-compare-vector x))))))

(defn day1p2
  "solving captcha with offset n/2"
  ([inputstring]
  (def x (inputstring-to-vector inputstring))
   (dot-product x (vector-of-valid-entries-with-offset x))))



