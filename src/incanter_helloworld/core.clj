(ns incanter-helloworld.core
  (:gen-class)
  (:use [incanter core stats charts]))

(defn -main
  "Hello world for Incanter."
  [& args]
  (view (histogram (sample-normal 1000))))
