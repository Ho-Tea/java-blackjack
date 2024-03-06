# java-blackjack

블랙잭 미션 저장소

## 기능 요구사항 해석

### 요구사항

- 블랙잭 게임을 변형한 프로그램을 구현한다. 블랙잭 게임은 딜러와 플레이어 중 카드의 합이 21 또는 21에 가장 가까운 숫자를 가지는 쪽이 이기는 게임이다.
- 카드의 숫자 계산은 카드 숫자를 기본으로 하며, 예외로 Ace는 1 또는 11로 계산할 수 있으며, King, Queen, Jack은 각각 10으로 계산한다.
- 게임을 시작하면 플레이어는 두 장의 카드를 지급 받으며, 두 장의 카드 숫자를 합쳐 21을 초과하지 않으면서 21에 가깝게 만들면 이긴다. 21을 넘지 않을 경우 원한다면 얼마든지 카드를 계속 뽑을 수 있다.
- 딜러는 처음에 받은 2장의 합계가 16이하이면 반드시 1장의 카드를 추가로 받아야 하고, 17점 이상이면 추가로 받을 수 없다.
- 게임을 완료한 후 각 플레이어별로 승패를 출력한다.

### 해석

- 플레이어 이름은 공백으로 입력할 수 없다.
- 플레이어는 입력 순서대로 출력한다.
- 플레이어는 최소1명, 최대 8명이다.
- 플레이어의 숫자가 21을 넘는 경우 카드를 받을 수 없다.
- 플레이어에게 카드를 더 받을지 물어볼 때, Ace는 1로 계산한다.
- 딜러와 플레이어의 카드 합계가 같을 경우 무승부로 한다.

## 게임 참가자

- 카드 패
  - [x] 카드를 패에 넣는다.
  - [x] 카드의 합을 구한다.
    - [x] Ace를 1 또는 11로 계산해서 21에 더 가까운 값으로 결과를 정한다.

### 플레이어

- 이름
  - [x] 게임에 참여할 사람의 이름 생성
    - [x] 공백이 입력된 경우 예외 발생
- [x] 플레이어는 최소1명, 최대 8명이다.
  - [x] 플레이어가 최소 1명, 최대 8명이 아닌 경우 예외 발생

### 딜러

- 카드 덱
  - [x] 카드를 카드덱에서 뽑는다.
  - [x] 카드를 섞는다.

## 블랙잭 게임

- [x] 게임 시작 시 딜러와 플레이어에게 카드를 2장씩 나누어준다.
- [ ] 게임 진행 중 딜러와 플레이어에게 카드를 1장씩 나누어준다.
  - [ ] 플레이어가 들고 있는 카드의 합을 구한다. 
  - [ ] 카드의 합계가 21 초과이면 더 이상 카드를 나누어주지 않는다.
  - [ ] 카드의 합계가 21 이하이면 카드를 또 나누어줄 수 있다. 
- [ ] 딜러의 카드 합계가 16 이하면 카드를 한 장 더 받는다.
 

## 카드

- [x] 카드를 맨 위에서 뽑는다.
- [x] 카드를 섞는다.
- [x] 카드의 합을 구한다.

## 입력

- [ ] 게임에 참여할 사람의 이름 입력 (쉼표를 기준으로 분리)
  - [ ] 공백이 입력된 경우 예외 발생
- [ ] 플레이어에게 카드를 더 받을지에 대해 입력을 받는다.
  - [ ] 'y'를 선택한 플레이어에게 카드를 주고, 다시 물어본다.

## 출력

- [ ] 카드를 나눈 결과를 출력한다.
  - [ ] 딜러의 카드 두 장 중 한 장만 공개한다.
- [ ] 플레이어들에게 카드를 더 받을지 물어본다.
  - [ ] 카드를 받을 때마다 해당 플레이어의 카드를 모두 출력한다.
- [ ] 딜러의 추가 카드를 받았다면 해당 내용을 출력한다.
- [ ] 카드 계산 결과를 출력한다.
- [ ] 최종 승패를 출력한다.
