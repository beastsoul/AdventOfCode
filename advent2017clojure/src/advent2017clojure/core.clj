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
(map translate-true-false [true false])
(defn day1
  "solving captcha"
  ([inputstring]
  (def x (inputstring-to-vector inputstring))
   (dot-product x (vector-of-valid-entries x))))
