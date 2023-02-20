//01:02:10
function solution(case1) {
  const input = case1.split("\n");
  const bufferSize = +input[0];
  const packets = input.slice(1).map(Number);

  let router = [];
  let frontIdx = 0;
  let rearIdx = 0;

  const checkIsFull = () => {
    return rearIdx - frontIdx >= bufferSize; // 5
  };

  packets.forEach((packet, idx) => {
    if (packet === -1) return;

    if (packet > 0 && !checkIsFull()) {
      // router buffer에 입력
      router[rearIdx] = packet;
      rearIdx++;
    } else if (packet === 0) {
      // router buffer에서 출력
      router[frontIdx] = 0;
      frontIdx++;
    }
  });

  let filtered = router.filter((el) => el !== 0);
  return filtered.length === 0 ? "empty" : filtered.join(" ");
}

const case1 = `5
1
2
0
3
4
0
5
6
0
0
-1`;

console.log(solution(case1));
