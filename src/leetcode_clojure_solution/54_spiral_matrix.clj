(ns leetcode-clojure-solution.54-spiral-matrix)

(defn rotate [input]
  (reverse (apply map vector input)))

(defn spiral-print [input]
  (loop [[first-row & more-rows] input
         accum []]
    (if (nil? more-rows)
      (concat accum first-row)
      (recur (rotate more-rows) (concat accum first-row)))
    ))

(spiral-print [[1 2 3] [4 5 6] [7 8 9]])
