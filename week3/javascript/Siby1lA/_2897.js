// 01:00:58
function solution(parkingLot) {
  const input = parkingLot.split("\n");
  const [R, C] = input[0].split(" ").map(Number);
  const SPACE = input.splice(1, R);
  let result = Array.from({ length: 5 }, () => 0);

  for (let i = 0; i < R - 1; i++) {
    for (let j = 0; j < C - 1; j++) {
      let count = 0;
      if (
        SPACE[i][j] === "#" ||
        SPACE[i][j + 1] === "#" ||
        SPACE[i + 1][j] === "#" ||
        SPACE[i + 1][j + 1] === "#"
      ) {
        continue;
      }
      if (SPACE[i][j] === "X") {
        count++;
      }
      if (SPACE[i + 1][j] === "X") {
        count++;
      }
      if (SPACE[i][j + 1] === "X") {
        count++;
      }
      if (SPACE[i + 1][j + 1] === "X") {
        count++;
      }
      for (let k = 0; k < result.length - 1; k++) {
        if (count === k) result[k]++;
      }
    }
  }
  return result.join("\n");
}

const parkingLot = `4 4
#..#
..X.
..X.
#XX#`;

console.log(solution(parkingLot));
