(ns class-not-found.core
  (:require [cascalog.api :refer [defparallelagg]])
  (:gen-class))

(defparallelagg parallel-mult
  :init-var #'identity
  :combine-var #'*)

(defn -main [& args])

