(defn exp [x n]
  (loop [acc 1 n n]
    (if (zero? n) acc
        (recur (* x acc) (dec n)))))

(defn sum-of-squares [n]
  (+ (/ n 6) (+ (/ (exp n 3) 3) (/ (exp n 2) 2))))


(defn square-of-sum [n]
  (let [x (/ (* n (+ n 1)) 2)]
    (* x x)))

(defn sum-square-difference [n]
  (- (square-of-sum n) (sum-of-squares n)))

