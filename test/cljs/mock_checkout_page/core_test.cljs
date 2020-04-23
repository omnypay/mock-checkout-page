(ns omnyway.mock-checkout-page.core-test
    (:require [cljs.test :refer-macros [deftest testing is]]
              [omnyway.mock-checkout-page.core :as core]))

(deftest fake-test
  (testing "fake description"
    (is (= 1 2))))
