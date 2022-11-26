// 00:52:57
function solution(mushrooms) {
  let score = 0;
  let targetScore = 100;
  let min = Number.MAX_SAFE_INTEGER;
  let diff = 0;
  let answer = 0;
  mushrooms.forEach((mushroom) => {
    score += mushroom;
    diff = Math.abs(score - targetScore);
    if (diff <= min) {
      min = diff;
      answer = Math.max(answer, score);
    }
  });
  return answer;
}
let mushrooms = [1, 2, 3, 5, 8, 13, 21, 34, 55, 89];
console.log(solution(mushrooms));
