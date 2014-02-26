(defn div-by-1-to-20? [n]  
  (and 
    (= (mod n 20) 0)
    (= (mod n 19) 0)
    (= (mod n 18) 0)
    (= (mod n 17) 0)
    (= (mod n 16) 0)
    (= (mod n 15) 0)
    (= (mod n 14) 0)
    (= (mod n 13) 0)
    (= (mod n 11) 0)))  

(defn smallest []
  (let [naturals (iterate inc 1)]
    (+ 1 (last (take-while (fn [x] (not (div-by-1-to-20? x))) naturals)))))

