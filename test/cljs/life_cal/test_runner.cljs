(ns life-cal.test-runner
  (:require
   [doo.runner :refer-macros [doo-tests]]
   [life-cal.core-test]
   [life-cal.common-test]))

(enable-console-print!)

(doo-tests 'life-cal.core-test
           'life-cal.common-test)
