(ns advent2017clojure.day2
  (:require [clojure.string :as str]
            [clojure.math.combinatorics :as combo]
            ))

(defn minMaxDiff [vector](- (apply max vector) (apply min vector)))
(defn day2 ([y](apply + (map minMaxDiff (vec (map (fn [x](map read-string (str/split x  #"	")))  (str/split y #"\n")))))))
(defn parse-input-to-vec [inputstring](vec (map (fn [x](vec(map read-string (str/split x  #"	"))))  (str/split inputstring #"\n"))))

(defn devide-tuple [values] (apply * (map (fn [x](apply / x)) values)))

(defn divisible-tuple? [x](let [[x1 x2] x](= 0 (mod x1 x2))))
(defn cartesian-square [x] (vec (combo/cartesian-product x x)))
(defn filtered-input [x] (filter divisible-tuple? (cartesian-square x)))

(defn find-and-devide [input-vector] (->> input-vector
                                      (map filtered-input)
                                      (map devide-tuple)))
(defn day2p2 [y](apply + ( find-and-devide (parse-input-to-vec y))))

