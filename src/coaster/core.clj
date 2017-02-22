(ns coaster.core
  (:gen-class)
  (require [scad-clj.scad :refer :all]
           [scad-clj.model :refer :all]))

(defn simple-coaster
  "create a simple coaster"
  []
  (minkowski
    (cube 70 70 2)
    (->>
      (cylinder 3 1)
      (with-fn 40))))

(defn -main
  "create a coaster .scad file"
  [& args]
  (spit "dist/coaster.scad"
    (write-scad
      (simple-coaster))))
