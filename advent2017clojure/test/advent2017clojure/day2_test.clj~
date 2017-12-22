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

(deftest day1p2test
  (testing "two different digits"
    (def testvector "1212")
    (def expected (advent2017clojure.core/day1p2 testvector))
    (is (= expected 6 )))
  (testing "no matches"
    (def testvector "1221")
    (def expected (advent2017clojure.core/day1p2 testvector))
    (is (= expected 0)))
  (testing "2 matches"
    (def testvector "123425")
    (def expected (advent2017clojure.core/day1p2 testvector))
    (is (= expected 4)))
  (testing "additional test"
    (def testvector "123123")
    (def expected (advent2017clojure.core/day1p2 testvector))
    (is (= expected 12)))
  (testing "test with 8 diggits"
    (def testvector "12131415")
    (def expected (advent2017clojure.core/day1p2 testvector))
    (is (= expected 4)))
  )

  
