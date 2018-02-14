pragma solidity ^0.4.0;

contract MyBellow
{
 struct bank
 {
    
     uint256 trans;
 }
 mapping(uint256 => bank)bank1;
    
    uint256 amount=5000;
    uint256 recbalance;
    
    modifier b(address ad,uint256 trans)
    {
        require((ad==msg.sender)&&(amount>trans));
        _;
    }
    function sender(address ad,uint256 id,uint256 _trans)b(ad,_trans)public
    {
         
        bank1[id].trans=_trans;
       
    }
    function recive(uint256 id)public view returns(uint256)
    {
        
         return recbalance+bank1[id].trans;
    }
    function balance(uint256 id)public view returns(uint256)
    {
        return amount-bank1[id].trans;
    }
    
}
