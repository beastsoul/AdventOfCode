(ns advent2017clojure.day2-test
  (:require [clojure.test :refer :all]
            [advent2017clojure.day2 :refer :all]))

(deftest day2test
  (testing "testing input for minmaxdiff"
    (def teststring
"5	1	9	5
7	5	3
2	4	6	8")
    (def expected (advent2017clojure.day2/day2 teststring))
    (is (= expected 18)))
)

(deftest day2p2test
  (testing "testing input for adding divisions"
        (def teststring
"5	9	2	8
9	4	7	3
3	8	6	5")
        (def expected (advent2017clojure.day2/day2p2 teststring))
        (is (= expected 9 )))
  (testing "testing input for more tests"
        (def teststring
  "4	9	2	5
  9	14	7	19
  3	8	8	5")
        (def expected (advent2017clojure.day2/day2p2 teststring))
    (is (= expected 5 )))
  )
 
