(ns radar.core-test
  (:require [clojure.test :refer :all]
            [radar.core :refer :all]))

(defn count-webpage-size[url]
  (try
    (let [page (slurp url)]
      (count page))
    (catch Exception e 0)))

(deftest website
  (testing "That we have a default webpage for RADAR"
    (is (= 0 1))))



(run-tests)
