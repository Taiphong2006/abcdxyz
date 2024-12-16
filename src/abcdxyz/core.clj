(ns abcdxyz.core
  (:gen-class))

(defn take-smaller
  [s]
  (let [p (last s)]
    (vec (filter #(< % p) s))))

(defn take-bigger
  [s]
  (let [p (last s)]
    (vec (filter #(> % p) s))))



(defn quick-sort
  [s]
  (cond
    (empty? s) s
    (= 1 (count s)) s
    (= 2 (count s)) (if (> (s 0) (s 1))
                      [(s 1) (s 0)]
                      s)
    :else  (vec (concat (quick-sort (take-smaller s)) (vector (last s)) (quick-sort (take-bigger s))))))

(quick-sort [9 8 7 6 10])


