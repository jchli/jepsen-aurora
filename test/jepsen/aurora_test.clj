(ns jepsen.aurora-test
  (:require [clojure.test :refer :all]
            [jepsen.core :refer [run!]]
            [jepsen.aurora :refer :all]))

(deftest a-test
  (testing "always succeed"
    (is (= 1 1))))

(deftest install-test
  (run! (simple-test "0.23.0-1.0.debian81")))

