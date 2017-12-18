(ns advent2017clojure.core-test
  (:require [clojure.test :refer :all]
            [advent2017clojure.core :refer :all]))

(deftest day1test
  (testing "two different digits"
    (def testvector "1122")
    (def expected (advent2017clojure.core/day1 testvector))
    (is (= expected 3)))
  (testing "all 1"
    (def testvector "1111")
    (def expected (advent2017clojure.core/day1 testvector))
    (is (= expected 4)))
  (testing "all different"
    (def testvector "1234")
    (def expected (advent2017clojure.core/day1 testvector))
    (is (= expected 0)))
  (testing "only the last digit correct"
    (def testvector "9121212129")
    (def expected (advent2017clojure.core/day1 testvector))
    (is (= expected 9)))
  )

  
