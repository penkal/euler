(defn is-palindrome? [s] 
  (= (seq s) (reduce conj () s)))

(defn largest-palindrome [n]
  (first 
    (sort > 
      (map read-string 
        (filter is-palindrome? 
          (map str 
          (flatten (for [x (range 1 (inc n))] (for [y (range 1 (inc x))] (* x y))))))))))

